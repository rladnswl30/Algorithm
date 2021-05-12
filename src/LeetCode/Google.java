package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author woonji.kim
 */
public class Google {
	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
		String[] emails2 = {"fg.r.u.uzj+o.pw@kziczvh.com", "r.cyo.g+d.h+b.ja@tgsg.z.com", "fg.r.u.uzj+o.f.d@kziczvh.com", "r.cyo.g+ng.r.iq@tgsg.z.com",
			"fg.r.u.uzj+lp.k@kziczvh.com", "r.cyo.g+n.h.e+n.g@tgsg.z.com", "fg.r.u.uzj+k+p.j@kziczvh.com", "fg.r.u.uzj+w.y+b@kziczvh.com", "r.cyo.g+x+d.c+f.t@tgsg.z.com",
			"r.cyo.g+x+t.y.l.i@tgsg.z.com", "r.cyo.g+brxxi@tgsg.z.com", "r.cyo.g+z+dr.k.u@tgsg.z.com", "r.cyo.g+d+l.c.n+g@tgsg.z.com", "fg.r.u.uzj+vq.o@kziczvh.com",
			"fg.r.u.uzj+uzq@kziczvh.com", "fg.r.u.uzj+mvz@kziczvh.com", "fg.r.u.uzj+taj@kziczvh.com", "fg.r.u.uzj+fek@kziczvh.com"};
		System.out.println(numUniqueEmails(emails2));
	}

	public static int numUniqueEmails(String[] emails) {
//		if (emails.length < 1 || emails.length > 100) {
//			return 0;
//		}

		Set<String> compares = new HashSet<>();

		for (int i = 0; i < emails.length; i++) {
//			if (emails[i].length() < 1 || emails.length > 100) {
//				continue;
//			}

//			if (emails[i].contains("@") == false) {
//				continue;
//			}

			String[] splitEmail = emails[i].split("\\@");
//			if (splitEmail[0].isEmpty() || splitEmail[1].isEmpty()) {
//				continue;
//			}
//
//			if (splitEmail[0].substring(1).equals("+")) {
//				continue;
//			}

			String local = splitEmail[0].replaceAll("\\.", "");
			String[] localRemovePlusArray = local.split("\\+");
			String localRemovePlus = localRemovePlusArray[0];

			emails[i] = localRemovePlus + "@" + splitEmail[1];

			compares.add(emails[i]);
		}

		return compares.size();
	}

	public static int numUniqueEmails2(String[] emails) {
		Set<String> compares = new HashSet<>();

		for (int i = 0; i < emails.length; i++) {
			String[] splitEmail = emails[i].split("\\@");
			String localRemovePlus = splitEmail[0].replaceAll("\\.", "").split("\\+")[0];

			emails[i] = localRemovePlus + "@" + splitEmail[1];

			compares.add(emails[i]);
		}

		return compares.size();
	}
}
