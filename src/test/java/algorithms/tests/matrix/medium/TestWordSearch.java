package algorithms.tests.matrix.medium;

import matrix.medium.WordSearch;
import org.junit.Assert;
import org.junit.Test;

public class TestWordSearch {

    WordSearch search = new WordSearch();

    @Test
    public void testExist() {
        Assert.assertTrue(search.exist(new char[][]{
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'},
                },
                "ABCCED"));
    }
}
