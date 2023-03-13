package Java.homework_03;

public abstract class Figure implements Comparable<Figure>{
    public abstract double squareFigure();

    @Override
    public String toString() {
        return String.format(new StringBuilder().append(this.getClass().getSimpleName())
                .append("\n\tПлощадь, см^2: %.2f;").toString(), squareFigure());
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.squareFigure(), o.squareFigure());
    }
}

