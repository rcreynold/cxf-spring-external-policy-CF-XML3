# CXF 4.1.2 + Spring 6 Code-First Example with External UserNameToken Policy (XML)

## Project Structure

- `pom.xml`
- `src/main/java/org/example/service/HelloService.java` (JAX-WS interface)
- `src/main/java/org/example/service/HelloServiceImpl.java`
- `src/main/webapp/WEB-INF/web.xml`
- `src/main/webapp/WEB-INF/cxf-beans.xml`
- `src/main/resources/policy/username_policy.xml`

## How to Build and Run

1. Build with Maven
   ```sh
   mvn clean package
   ```
2. Deploy the `war` to a Jakarta EE 10 compatible servlet container.
3. WSDL will be available at:
   ```
   http://localhost:8080/cxf-spring-external-policy/services/hello?wsdl
   ```
4. The service requires WS-Security UsernameToken as per the included external policy.

## Credentials

- Username: `testuser`
- Password: `testpass`

## Notes

- All config is XML-based.
- Uses external policy file for WS-Security (UserNameToken).
