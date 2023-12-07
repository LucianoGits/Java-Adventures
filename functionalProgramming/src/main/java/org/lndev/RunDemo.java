package org.lndev;

public class RunDemo {
    public static void main(String[] args) {
        City paris = new City();
        City lyon = new City();

        paris.setLongitude(2.349014);
        lyon.setLongitude(4.850000);
        //============= Lambda =================//
        OrderManagement orderManagement = new OrderManagement(new DefaultDistanceCalculator());

        //without lambda function(anonymous function)
        orderManagement.setDistanceCalculator(new DistanceCalculator() {
            @Override
            public double CalculateDistance(City city1, City city2) {
                return 0;
            }
        });

        DistanceCalculator distanceCalculator = ((city1, city2) -> city1.getLongitude()- city2.getLongitude());

        DistanceCalculator distanceCalculator2 = (city1, city2) ->{
            System.out.println("distanceCalculator2 Lambda function text");
            return city1.getLongitude() - city2.getLongitude();
        };

        System.out.println(distanceCalculator2.CalculateDistance(lyon,paris));

        //============= Method reference demo =================//
        orderManagement.setDistanceCalculator(GoogleDistanceCalculator::getStaticDistanceBetweenCities);
        GoogleDistanceCalculator googleDistanceCalculator = new GoogleDistanceCalculator();
        orderManagement.setDistanceCalculator(googleDistanceCalculator::getDistanceBetweenCities);

    }



}
