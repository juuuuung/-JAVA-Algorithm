package Kakao.Problem;

import java.util.HashMap;
import java.util.HashSet;

public class Report {
	public static void main(String[] args) {
		int k = 2;
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		int[] answer = {};

		HashMap<String, HashSet<String>> reportedMap = new HashMap<>();
		HashMap<String, Integer> answerMap = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reported = new HashSet<>();
			reportedMap.put(id_list[i], reported);
			answerMap.put(id_list[i], 0);
		}

		for (String key : reportedMap.keySet()) {
			System.out.println(key);
		}

		for (String s : report) {
			String[] reportStr = s.split(" ");
			String reportingID = reportStr[0];
			String reportedID = reportStr[1];
			System.out.println(reportStr[1] + " haha : " + reportStr[0]);
			reportedMap.get(reportedID).add(reportingID);
		}

		for (String key : reportedMap.keySet()) {
			HashSet<String> reportingUser = reportedMap.get(key);
			if (reportingUser.size() >= k) {
				for (String s : reportingUser) {
					answerMap.put(s, answerMap.get(s) + 1);
				}
			}
		}

		for (String s : answerMap.keySet()) {
			System.out.println(answerMap.get(s));
		}
	}
}
