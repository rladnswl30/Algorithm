import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int packetsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> packets = IntStream.range(0, packetsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int channels = Integer.parseInt(bufferedReader.readLine().trim());

        long result = maximumQuality(packets, channels);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    /*
     * Complete the 'maximumQuality' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY packets
     *  2. INTEGER channels
     */

    public static long maximumQuality(List<Integer> packets, int channels) {
        // O(N)

        int packetsLen = packets.size();
        double sum = 0;

        // if channels and packet length is same, sum all packets
        if (packetsLen == channels) {
            for (int i = 0; i < packetsLen; i++) {
                sum += packets.get(i);
            }
            return (long)sum;
        }

        // sort all packets
        Collections.sort(packets);

        for (int i = packetsLen - channels + 1; i < packetsLen; i++) {    // sum remaining channels packet
            sum += packets.get(i);
        }

        packetsLen -= channels;

        if (packetsLen % 2 == 0) { // even
            sum += packets.get(packetsLen / 2);
        } else { // odd
            sum += (double)(packets.get(packetsLen / 2) + packets.get((packetsLen / 2) + 1)) / 2; // like example (2 + 3) / 2 = 2.5
        }

        return (long)Math.ceil(sum);  // round up result
    }
}
