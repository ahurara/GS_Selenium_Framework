# GS Automation Test Suite

This test suite automates the login functionality testing for the Golden Scent website.

## Prerequisites

- Java JDK 8 or higher
- Maven
- Chrome browser installed
- Internet connection

## Setup

1. Clone the repository
2. Create a `.env` file in the `src` directory with the following content:
   ```
   PH_NUMBER=your_phone_number
   OTP=your_valid_otp
   OTP2=your_invalid_otp
   ```
   Replace the values with your actual test data.

## Project Structure

```
src/
├── main/
│   └── java/
│       └── org/example12/
│           ├── ConfigLoaders/    # Configuration utilities
│           ├── PageObjects/      # Page Object Models
│           └── drivers/          # WebDriver setup
└── test/
    ├── java/                    # Test classes
    └── resources/               # Test resources
```

## Running Tests

### Using Maven

To run all tests:
```bash
mvn clean test
```

To run a specific test class:
```bash
mvn test -Dtest=LOGIN_TESTCASE
```

### Using IDE

1. Open the project in your preferred IDE (IntelliJ IDEA recommended)
2. Navigate to `src/test/java/LOGIN_TESTCASE.java`
3. Right-click and select "Run LOGIN_TESTCASE"

## Test Cases

The test suite includes the following test cases:

1. **GS_Valid_Login**
   - Tests successful login with valid credentials
   - Steps:
     1. Navigates to the website
     2. Changes language to English
     3. Opens login modal
     4. Enters valid phone number
     5. Enters valid OTP

2. **GS_Invalid_Login**
   - Tests login failure with invalid OTP
   - Steps:
     1. Navigates to the website
     2. Changes language to English
     3. Opens login modal
     4. Enters valid phone number
     5. Enters invalid OTP
     6. Verifies error message

