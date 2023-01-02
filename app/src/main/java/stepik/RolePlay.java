package stepik;

import java.util.*;

public class RolePlay {
    public String printTextPerRole(String[] roles, String[] textLines) {
        LinkedHashMap<String, List<String>> result = new LinkedHashMap<>();
        for (String role : roles) {
            result.put(role, new ArrayList<>());
        }
        for (int i = 0; i < textLines.length; i++) {
            String textLine = textLines[i];
            int delimiter = textLine.indexOf(":");
            String actor = textLine.substring(0, delimiter);
            String text = textLine.substring(delimiter + 2);
            result.get(actor).add(i + 1 + ") " + text);
        }
        return result.entrySet().stream()
            .map(entry -> entry.getKey() + ":\n" + String.join("\n", entry.getValue()))
                .collect(java.util.stream.Collectors.joining("\n\n"));
    }
}
