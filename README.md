# 🌩️ Storm Safety - Sistema Inteligente de Ocorrências Climáticas

**Storm Safety** é um sistema web desenvolvido em Java com Spring Boot, criado para auxiliar a população e a Defesa Civil no gerenciamento de ocorrências relacionadas a tempestades e desastres naturais. A plataforma possibilita o registro, visualização e atualização de eventos, integrando-se a um banco de dados em nuvem com deploy automatizado via GitHub Actions.

---

## 👨‍💻 Equipe de Desenvolvimento

| Nome                      | RM       | Turma    |
|---------------------------|----------|----------|
| Murillo Ferreira Ramos    | 553315   | 2TDSPC   |
| Pedro Luiz Prado          | 553874   | 2TDSPC   |
| William Kenzo Hayashi     | 552659   | 2TDSPS   |

---

## 🌐 Acesso à Aplicação

🔗 [https://app-stormsafety.azurewebsites.net](https://app-stormsafety.azurewebsites.net)

---

## 🎬 Apresentação em Vídeo

📽️ [https://www.youtube.com/watch?v=_eskEYuwo0w)](https://www.youtube.com/watch?v=_eskEYuwo0w)

---

## 📋 Sobre o Projeto

O **Storm Safety** surgiu como resposta ao desafio proposto pela FIAP na Global Solution 2025, com foco em eventos extremos. A aplicação tem como finalidade criar um canal digital acessível, ágil e confiável para que cidadãos possam reportar situações de risco climático e auxiliar os órgãos responsáveis a tomarem decisões rápidas e informadas.

---

## 🎯 Objetivos do Sistema

- 📝 Permitir o **registro de ocorrências** com nome, e-mail, tipo e localização
- 📊 Exibir todas as ocorrências de forma organizada e acessível
- 🔄 Permitir a **atualização** e **remoção** dos dados cadastrados
- ☁️ Realizar o **deploy automatizado** na Azure usando GitHub Actions
- 🛢️ Utilizar **SQL Server em nuvem** como base de dados

---

## 🧪 Tecnologias e Ferramentas

- Java 17 + Spring Boot 3
- Spring MVC + Thymeleaf
- Spring Data JPA + SQL Server (Azure)
- Bootstrap 4 (estilização)
- GitHub Actions (CI/CD)
- Azure App Service

---

## 🚀 Como Executar Localmente

```bash
git clone https://github.com/mulliru/storm-safety-web.git
cd storm-safety-web
mvn clean install -DskipTests
mvn spring-boot:run
```

🔎 Acesse: `http://localhost:8080/`

---

## ⚙️ Configuração do Banco de Dados

No arquivo `application.properties`, configure as credenciais da Azure SQL:

```properties
spring.datasource.url=jdbc:sqlserver://<servidor>.database.windows.net:1433;database=<nome-banco>;...
spring.datasource.username=<usuario>
spring.datasource.password=<senha>
```

---

## 📌 Observações Finais

Este projeto foi desenvolvido como parte do desafio interdisciplinar da **Global Solution FIAP 2025**, integrando conhecimentos técnicos e visão social para oferecer uma solução real para problemas enfrentados em períodos de eventos extremos.

