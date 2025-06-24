# keycloak


# 🔐 Spring Boot + Keycloak Integration

This project demonstrates how to integrate **Spring Boot 3/5** with **Keycloak** for OAuth2-based authentication using OIDC.

## 🚀 Features

- Keycloak-based login and logout
- Secure REST API endpoints
- Public and private routes
- Bootstrap-styled UI
- Token-based user session handling

---

## 📦 Tech Stack

- Spring Boot 3.x / 5.x
- Spring Security (OAuth2 Client)
- Keycloak (OpenID Connect)
- HTML + Bootstrap
- Maven

---

## 🔧 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/springboot-keycloak-integration.git
cd springboot-keycloak-integration


## 2. Keycloak Setup
Run Keycloak locally or in Docker.

Create a Realm (e.g., demo-realm)

Create a Client (e.g., springboot-client)

Set Access Type to confidential

Set Valid Redirect URIs: http://localhost:8088/login/oauth2/code/keycloak

Copy client-id and client-secret


App will be accessible at:
📍 http://localhost:8088
