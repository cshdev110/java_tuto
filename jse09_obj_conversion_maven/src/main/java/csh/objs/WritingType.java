package csh.objs;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */

public enum WritingType {
    CLASIC("Manual"),
    MODERN("Digital");

    private final String description;

    private WritingType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
