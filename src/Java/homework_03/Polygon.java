package Java.homework_03;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure{
    List<Double> sides = new ArrayList<>();

    protected Polygon(double... sides) throws Exception{
        for (double side: sides){
            if (side <= 0){
                throw new Exception("Стороны фигур должны быть больше 0!");
            }
        }
    }
    public double perimeter(){
        return this.sides.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String toString() {
        return new StringBuilder().append(super.toString())
                .append(String.format("\n\t Пeриметр, см: %.2f;\n", perimeter())).toString();
    }
}

