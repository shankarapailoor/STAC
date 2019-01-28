import com.cyberpointllc.stac.calculator.Calculator;
import com.cyberpointllc.stac.calculator.LargeNumeralFormatter;
import edu.utexas.stac.Cost;

public class Calc {
        public long computeExpression(String expression) {
            LargeNumeralFormatter formatter = new LargeNumeralFormatter();
            Calculator calc = new Calculator(formatter);
            Cost.reset();
            calc.handleExpression(expression);
            return Cost.read();
        }
}
