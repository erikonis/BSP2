public class Quadratic {
        public double a,b,c;

        Quadratic(double a, double b, double c) {

            this.a = a;
            this.b = b;
            this.c = c;

        }
        
        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }
    
        public double getDiscriminant() {

            double result = ((b*b) - (4*a*c));
            return result;    
        }

        public double getRoot1() {
            double root1 = ((-b + Math.sqrt(getDiscriminant()))/(2*a));
            return root1;
        }

        public double getRoot2() {
            double root1 = ((-b-Math.sqrt(getDiscriminant()))/(2*a));
            return root1;
        }

    }
