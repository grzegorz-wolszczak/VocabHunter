/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.vocabhunter.analysis.simple;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class WordStreamTool {
    private static final Pattern PATTERN = Pattern.compile(
        "^\\P{javaLetter}+|\\P{javaLetter}+$|\\p{javaWhitespace}\\P{javaLetter}*|\\P{javaLetter}*\\p{javaWhitespace}");

    private WordStreamTool() {
        // Prevent instantiation - all methods are private
    }

    public static Stream<String> words(final String line) {
        return PATTERN.splitAsStream(line)
            .filter(w -> !w.isEmpty());
    }
}