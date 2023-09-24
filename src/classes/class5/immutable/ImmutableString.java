package classes.class5.immutable;

public final class ImmutableString {

    private char[] values;

    public ImmutableString(String string) {
        values = string.toCharArray();
    }

    public String getValues() {
        return String.valueOf(values);
    }
}
