# Space Flight App
The Space Flight App provides users with a list of Falcon 9 launches detailing the flight name, flight date and mission success. The data shown in the app is retrieved from the SpaceX API. 

![Alt text](app/docs/images/first-launches-screenshot.png?raw=true "First Launches Screenshot") ![Alt text](app/docs/images/second-launches-screenshot.png?raw=true "Second Launches Screenshot")


# Libraries Used
- Koin to provide constructor dependency injection to classes in the application
- Retrofit to provide access to the backend API endpoints
- WorkManager to retrieve flight data from the API service in the background
- Coroutines to run API network requests on background threads
- AndroidX to provide Lifecycle and LiveData functionality to the app
- Room to store the Flight responses from Retrofit.
- Data binding to bind the inflated layout files to instances running in the application code.
- Espresso to perform instrumentation tests on the user interface
- Mockito to mock the FlightViewModel and FlightRepository classes

# Test Cases
Espresso provides End-to-End testing of the application and network calls. Test cases included:
- Testing the HomeFragment TextView and RecyclerView

Mockito testing provides Unit testing of the ViewModel and Repository dependencies. Test cases included:
- Testing the coroutine launch function in the FlightViewModel and the FlightRepository classes
- Testing the dependency interactions between the FlightViewModel and FlightRepository classes
- Testing the dependency interactions between the FlightRepository and the FlightDao interfaces

# Architecture Design
![Alt text](app/docs/images/mvvm_architecture.png?raw=true "MVVM Architecture") 

