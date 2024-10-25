package t;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-sub-folders-from-the-filesystem
 */
public class RemoveSubFoldersFromTheFilesystem {
    public List<String> removeSubfolders(String[] folder) {
        List<String> sorted = Arrays.stream(folder).sorted(String::compareTo).toList();
        List<String> result = new LinkedList<>();
        result.add(sorted.getFirst());
        for (int i = 1; i < sorted.size(); i++) {
            var current = sorted.get(i);
            if (!current.startsWith(result.getLast() + "/")) {
                result.add(current);
            }
        }
        return result;
    }
}
