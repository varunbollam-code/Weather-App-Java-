import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // display our weather app gui
                new WeatherAppGui().setVisible(true);

                // System.out.println(WeatherApp.getLocationData("Tokyo"));

                // System.out.println(WeatherApp.getCurrentTime());

            }
        });
    }
}
/*
 * WeatherAppGui Class:
 * This class represents the graphical user interface (GUI) of a weather
 * application. Here's a breakdown of its key components:
 * 
 * Constructor (WeatherAppGui()):
 * 
 * Initializes the GUI window properties such as title, size, position, layout,
 * and sets up the default close operation.
 * Calls addGuiComponents() to add GUI components.
 * addGuiComponents() Method:
 * 
 * Adds various GUI components such as text fields, labels, buttons, etc., to
 * the GUI window.
 * Sets the position, size, and appearance of each component.
 * Defines an action listener for the search button to fetch weather data based
 * on user input and update the GUI accordingly.
 * loadImage(String resourcePath) Method:
 * 
 * Loads an image from the specified resource path and returns it as an
 * ImageIcon.
 * This method is used to load weather condition images for display in the GUI.
 * Instance Variables:
 * 
 * private JSONObject weatherData: Stores the weather data fetched from the
 * backend.
 * WeatherApp Class:
 * This class contains the backend logic for fetching weather data from an
 * external API. Here's an overview:
 * 
 * getWeatherData(String locationName) Method:
 * 
 * Takes a location name as input and retrieves weather data for that location.
 * Calls getLocationData() to get the geographic coordinates of the location.
 * Constructs a URL with the coordinates and queries the Open-Meteo API for
 * weather data.
 * Parses the JSON response to extract relevant weather information such as
 * temperature, weather condition, humidity, and windspeed.
 * Constructs and returns a JSON object containing the weather data.
 * getLocationData(String locationName) Method:
 * 
 * Takes a location name as input and retrieves geographic coordinates for that
 * location using the Open-Meteo geocoding API.
 * Constructs a URL with the location name and queries the API.
 * Parses the JSON response to extract the location data.
 * Utility Methods:
 * 
 * fetchApiResponse(String urlString): Establishes a connection to the specified
 * URL and returns the HttpURLConnection.
 * findIndexOfCurrentTime(JSONArray timeList): Finds the index of the current
 * hour in the list of hourly timestamps.
 * getCurrentTime(): Gets the current time in the required format for querying
 * weather data.
 * convertWeatherCode(long weathercode): Converts numeric weather codes to
 * human-readable weather conditions.
 * These classes work together to provide a graphical interface for users to
 * search for weather information and display the retrieved data. The WeatherApp
 * class handles the communication with the weather API, while the WeatherAppGui
 * class handles the GUI components and user interactions.
 */
