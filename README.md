# 🛍️ Spring API Starter - E-Commerce Platform

A comprehensive Spring Boot starter template for building modern e-commerce applications with JWT authentication, shopping cart, order management, and Stripe payment integration.

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://openjdk.java.net/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue.svg)](https://www.mysql.com/)
[![JWT](https://img.shields.io/badge/JWT-Authentication-red.svg)](https://jwt.io/)

## ✨ Features

### 🔐 Authentication & Security
- JWT-based authentication with access and refresh tokens
- Role-based access control (User/Admin)
- Secure password hashing
- HTTP-only refresh token cookies

### 🛒 E-Commerce Core
- **Product Management**: CRUD operations for products with categories
- **Shopping Cart**: Add/remove items, update quantities
- **Order Management**: Complete order lifecycle with status tracking
- **User Profiles**: Extended user information with addresses and loyalty points

### 💳 Payment Integration
- Stripe payment processing
- Webhook support for payment confirmations
- Secure payment status tracking

### 🛠️ Developer Experience
- **Database Migrations**: Flyway for version-controlled schema changes
- **API Documentation**: OpenAPI/Swagger UI integration
- **Validation**: Comprehensive input validation with custom constraints
- **DTOs & Mappers**: Clean separation with MapStruct
- **Exception Handling**: Global exception handler with meaningful error responses

## 🚀 Quick Start

### Prerequisites
- Java 25+
- MySQL 8.0+
- Maven 3.6+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/spring-api-starter.git
   cd spring-api-starter
   ```

2. **Set up environment variables**
   Create a `.env` file in the root directory:
   ```env
   JWT_SECRET=your-super-secret-jwt-key-here
   STRIPE_SECRET_KEY=sk_test_your_stripe_secret_key
   STRIPE_WEBHOOK_SECRET_KEY=whsec_your_webhook_secret
   ```

3. **Configure MySQL Database**
   Update `src/main/resources/application.yaml` with your database credentials:
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/store_api?createDatabaseIfNotExist=true
       username: your_db_username
       password: your_db_password
   ```

4. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

The application will start on `http://localhost:8080`

## 📚 API Documentation

Once the application is running, visit:
- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **API Docs**: `http://localhost:8080/v3/api-docs`

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/com/steampunk/store/
│   │   ├── config/           # Security & JWT configuration
│   │   ├── controllers/      # REST API endpoints
│   │   ├── dtos/            # Data Transfer Objects
│   │   ├── entities/        # JPA entities
│   │   ├── exceptions/      # Custom exceptions
│   │   ├── filters/         # Request filters
│   │   ├── mappers/         # MapStruct mappers
│   │   ├── payments/        # Stripe payment handlers
│   │   ├── repositories/    # JPA repositories
│   │   ├── services/        # Business logic
│   │   └── validations/     # Custom validators
│   └── resources/
│       ├── db/migration/    # Flyway migrations
│       └── templates/       # Thymeleaf templates
└── test/                    # Unit & integration tests
```

## 🔗 Key API Endpoints

### Authentication
- `POST /auth/login` - User login
- `POST /auth/register` - User registration
- `POST /auth/refresh` - Refresh access token

### Products
- `GET /products` - List all products (with optional category filter)
- `GET /products/{id}` - Get product details
- `POST /products` - Create new product (Admin only)
- `PUT /products/{id}` - Update product (Admin only)

### Shopping Cart
- `GET /cart` - Get user's cart
- `POST /cart/items` - Add item to cart
- `PUT /cart/items/{id}` - Update cart item quantity
- `DELETE /cart/items/{id}` - Remove item from cart

### Orders
- `GET /orders` - Get user's orders
- `POST /orders` - Create new order
- `GET /orders/{id}` - Get order details

## 🗄️ Database Schema

The application uses MySQL with the following main entities:

- **Users**: Customer accounts with roles
- **Products**: Items for sale with categories
- **Carts**: Shopping carts with cart items
- **Orders**: Purchase orders with order items
- **Addresses**: User shipping addresses
- **Profiles**: Extended user information

Database migrations are managed by Flyway and located in `src/main/resources/db/migration/`.

## 🧪 Testing

Run the test suite:
```bash
./mvnw test
```

## 🔧 Configuration

### Application Properties
Key configuration options in `application.yaml`:

- **JWT Settings**: Token expiration times
- **Database**: Connection details
- **Stripe**: API keys and webhook secrets

### Environment Variables
- `JWT_SECRET`: Secret key for JWT token signing
- `STRIPE_SECRET_KEY`: Stripe secret key for payments
- `STRIPE_WEBHOOK_SECRET_KEY`: Stripe webhook secret for payment confirmations

## 🚀 Deployment

### Build for Production
```bash
./mvnw clean package
java -jar target/spring-api-starter-0.0.1-SNAPSHOT.jar
```

### Docker Support
Add a `Dockerfile` and `docker-compose.yml` for containerized deployment.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Built with [Spring Boot](https://spring.io/projects/spring-boot)
- Authentication powered by [JWT](https://jwt.io/)
- Payments handled by [Stripe](https://stripe.com/)
- Database migrations with [Flyway](https://flywaydb.org/)

---

**Happy coding! 🎉**
