package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveSubFoldersFromTheFilesystemTest {
    RemoveSubFoldersFromTheFilesystem obj = new RemoveSubFoldersFromTheFilesystem();

    @Test
    void test1() {
        assertThat(obj.removeSubfolders(new String[]{
            "/a","/a/b","/c/d","/c/d/e","/c/f"
        })).isEqualTo(List.of("/a","/c/d","/c/f"));
    }

    @Test
    void test2() {
        assertThat(obj.removeSubfolders(new String[]{
            "/a","/a/b/c","/a/b/d"
        })).isEqualTo(List.of("/a"));
    }

    @Test
    void test3() {
        assertThat(obj.removeSubfolders(new String[]{
            "/a/b/c","/a/b/ca","/a/b/d"
        })).isEqualTo(List.of("/a/b/c","/a/b/ca","/a/b/d"));
    }
}