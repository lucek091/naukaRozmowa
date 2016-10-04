
public class Car {

    private String carColor;
    private String carName;
    private int carModel;

    @Override
    public String toString() {
        return "Car{" +
                "carColor='" + carColor + '\'' +
                ", carName='" + carName + '\'' +
                ", carModel=" + carModel +
                '}';
    }

    public Car(Builder builder){
        this.carModel=builder.carModel;
        this.carColor=builder.carColor;
        this.carModel=builder.carModel;
    }

    public static class Builder{
        private String carColor;
        private String carName;
        private int carModel;

        public Builder(int carModel){
            this.carModel=carModel;
        }

        public Builder carColor(String carColor){
            this.carColor=carColor;
            return this;
        }

        public Builder carName(String carName){
            this.carName=carName;
            return this;
        }

        public Builder carModel(int carModel){
            this.carModel=carModel;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }




}
