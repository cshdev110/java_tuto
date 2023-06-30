package csh.objs;

/**
 * @author: cshdev110
 * @version: 0.0.1
 */

public class Writer extends Employee{

    final WritingType writingType;

    public Writer(String name, double salary, WritingType writingType) {
        super(name, salary);
        this.writingType = writingType;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Writing Type: " + this.writingType.getDescription();
    }

    public WritingType getWritingType() {
        return this.writingType;
    }

    public String getWritingTypeTxt() {
        return this.writingType.getDescription();
    }
}
