package seedu.logic.parser;

import java.util.regex.Pattern;

import seedu.logic.parser.ArgumentTokenizer.Prefix;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_PHONE = new Prefix("d/");
    public static final Prefix PREFIX_EMAIL = new Prefix("s/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("e/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");

    /* Patterns definitions */
    public static final Pattern KEYWORDS_ARGS_FORMAT =
            Pattern.compile("(?<keywords>\\S+(?:\\s+\\S+)*)"); // one or more keywords separated by whitespace

}
