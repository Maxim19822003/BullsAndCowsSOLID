package org.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishGame extends AbstractGame{
    public EnglishGame() {
    }

    @Override
    List<String> generateCharList() {
        return new ArrayList(Arrays.asList("a", "e", "i", "o", "u", "y", "b", "c", "d", "f", "g", "h", "j", "k", "l",
                "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"));
    }
}
