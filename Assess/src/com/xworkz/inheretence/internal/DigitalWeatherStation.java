package com.xworkz.inheretence.internal;

    public class DigitalWeatherStation extends WeatherStation {

        public DigitalWeatherStation() {
            super();  // Calling the parent class constructor
            System.out.println("DigitalWeatherStation constructor");
        }

        public void checkTemperature() {
            super.checkTemperature();
            System.out.println("Checking the temperature using a digital sensor...");
        }

        public void checkHumidity() {
            super.checkHumidity();
            System.out.println("Checking the humidity using a digital sensor...");
        }

        public void checkPressure() {
            super.checkPressure();
            System.out.println("Checking the air pressure using a digital sensor...");
        }

        public void displayWeather() {
            super.displayWeather();
            System.out.println("Displaying the weather data digitally on a smart screen...");
        }

        public void calibrateStation() {
            super.calibrateStation();
            System.out.println("Calibrating the digital weather station using online software...");
        }
    }

