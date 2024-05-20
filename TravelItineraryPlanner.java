import java.util.Scanner;

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.println("Enter start date of Travel (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();

        System.out.println("Enter end date of Travel (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        
        WeatherAPI weatherAPI = new WeatherAPI();
        WeatherInfo weatherInfo = weatherAPI.getWeather(destination, startDate, endDate);

        
        BudgetCalculator budgetCalculator = new BudgetCalculator();
        double estimatedBudget = budgetCalculator.calculateBudget(destination, startDate, endDate);

       
        System.out.println("Travel Itinerary:");
        System.out.println("Destination Place: " + destination);
        System.out.println("Start Date of Travel: " + startDate);
        System.out.println("End Date of Travel: " + endDate);
        System.out.println("Estimated Budget For Travel: $" + estimatedBudget);
        System.out.println("Weather at the place: " + weatherInfo.getWeatherSummary());
    }
}

class WeatherAPI {
    public WeatherInfo getWeather(String destination, String startDate, String endDate) {
        
        return new WeatherInfo("Sunny");
    }
}

class WeatherInfo {
    private String weatherSummary;

    public WeatherInfo(String weatherSummary) {
        this.weatherSummary = weatherSummary;
    }

    public String getWeatherSummary() {
        return weatherSummary;
    }
}

class BudgetCalculator {
    public double calculateBudget(String destination, String startDate, String endDate) {
        
        return 10000.0;
    }
}