# Hey 👋 I'm Stanislav

**Software Engineer** building stuff in Glasgow, Scotland

💼 [LinkedIn](https://www.linkedin.com/in/starishko/)

---

## Quick Story

Moved from Ukraine to Scotland in 2022 when the war started. Career restart.

Built tons of enterprise software on **1C platform** (similar to Java/Python/.NET ecosystem) - ERP systems, financial platforms, logistics tools. Mostly boring corporate stuff, but paid the bills.

Now retraining in modern tech because honestly, the old stack was getting dull. Currently Year 2 of HND Software Engineering at Glasgow Clyde College.

**How I work:** Use AI tools to code faster - I'm not stupid, why type everything manually? But the architecture, design decisions, and "does this actually make sense?" - that's all me. Think of AI as a junior dev who types really fast but needs supervision.

---

## What I've Built Recently

### 🏗️ [Equipment and Resource Booking Management System](https://github.com/StanStarishko/equipment-rental-system)

![Java](https://img.shields.io/badge/Java-25-blue?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.5-6DB33F?logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?logo=apachemaven&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-5-25A162?logo=junit5&logoColor=white)
![Tests](https://img.shields.io/badge/Tests-64%20passed-brightgreen)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F?logo=thymeleaf&logoColor=white)
![H2](https://img.shields.io/badge/H2-In--Memory-1021FF)

Full-stack web application for managing equipment bookings within a small organisation. Built with Spring Boot, Thymeleaf and H2 Database. Features conflict detection, automatic status updates, 8 enforced business rules and 64 automated tests. Designed around a real problem I observed while volunteering at Glasgow Film Theatre and Shaw Trust.

**[Live Demo](https://stan-equipment-rental-system.onrender.com)** · **[Documentation](https://stanstarishko.github.io/equipment-rental-system/)**

---

### 🦁 [Clyde Conservation Management System](https://github.com/StanStarishko/ClydeConservation) 

[![Java](https://img.shields.io/badge/Java-25-orange?logo=java)](https://www.oracle.com/java/)
[![JUnit](https://img.shields.io/badge/JUnit-5-green?logo=junit5)](https://junit.org/junit5/)
[![Maven](https://img.shields.io/badge/Maven-3.9-blue?logo=apache-maven)](https://maven.apache.org/)
[![Tests](https://img.shields.io/badge/Tests-100%25-success)](docs/)
[![TDD](https://img.shields.io/badge/Methodology-TDD-blueviolet)](docs/Testing%20Strategy%20and%20Results.pdf)

**The project that taught me to think like an engineer, not just write code.**

Conservation management system with 100% test success (307 tests) achieved through 10 documented iterations. Started at 77.9% success with architectural issues, ended with clean 4-layer architecture and every test passing.

**What makes this interesting:**
- **Made the hard call:** Deleted 42 working tests because they were duplicates, tested implementation details, or added noise. Documented why for each one.
- **Fixed architecture, not symptoms:** When Round 06 hit 13 new failures, spent hours debugging before realizing validators were doing existence checks (wrong layer). Refactored → 13 tests passed immediately.
- **Full transparency:** 10 HTML test logs showing every failure, every fix, every decision. No hiding mistakes.

**What I actually learned:** Professional development isn't about perfect code on first attempt - it's about systematic problem-solving, making tough decisions (like deleting working code), and backing everything with evidence. The 42 deleted tests took more courage than writing 100 new ones.

📚 [Documentation Portal](https://stanstarishko.github.io/ClydeConservation/)

---

### 🤖 [AI-Powered UX Audit Tool](https://github.com/StanStarishko/Risidio-Stage2)
Built this in **6 hours** for a technical assessment (yes, with coffee breaks). Full-stack AI app that analyses websites using GPT-4, generates recommendations, visualises data. Serverless deployment on Vercel.

**Tech:** Next.js, TypeScript, OpenAI GPT-4, Tailwind CSS

**The challenge:** Show you can prototype fast without sacrificing quality. Delivered production-ready code with proper error handling, responsive design, and decent documentation.

---

### 🛒 [E-Commerce Backend API](https://github.com/StanStarishko/BackForCatalog)
Production-ready RESTful backend with OAuth 2.0, JWT tokens, rate limiting, comprehensive tests. Because building secure auth properly is important.

**Tech:** Node.js, Fastify, TypeScript, OAuth 2.0, JWT

**What's good about it:** Proper authentication flow, not the "store password in localStorage" nonsense. Serverless deployment, actual tests, sensible error handling.

---

### 🌐 [Full-Stack Web Applications Trilogy](https://github.com/StanStarishko/Node-RESTful-MongoDB-Bootstrap)
Three projects: car rental system, course management, product catalogue. 

Learned Node.js ecosystem and delivered **3 working apps in 2 weeks** (course timeline said 3 months - I got impatient).

**Tech:** Node.js, MongoDB, Express, Bootstrap

**What I learned:** Async JavaScript doesn't bite if you understand it. MongoDB is fine until you need complex queries. Bootstrap makes things look decent fast.

---

### 📊 [Medical Data Analysis Tool](https://github.com/StanStarishko/Portfolio/tree/main/Python/Heart%20Attack%20Risk%20Factors)
Heart attack risk analysis with patient data processing, statistical analysis, and visualisation.

**Tech:** Python, Pandas, NumPy, Matplotlib

**Takeaway:** Data science is 80% cleaning data, 15% trying to make sense of it, 5% making pretty charts.

---

## Tech I Actually Use

**Languages:** Python, Java, JavaScript/TypeScript  
**Backend:** Node.js, Next.js, Express, FastAPI, Flask  
**Frontend:** React, Tailwind CSS, Bootstrap  
**Databases:** MongoDB, PostgreSQL, MySQL, MSSQL  
**Cloud:** AWS (Lambda, S3, API Gateway), Vercel  
**Testing:** JUnit 5, Jest, PyTest - TDD methodology  
**Tools:** Git, REST APIs, OAuth 2.0, JWT, AI coding assistants

---

## Other Projects Worth Checking

- [Glasgow Clyde Runners Club](https://github.com/StanStarishko/Portfolio/tree/main/Java/Glasgow%20Clyde%20Runners%20Club) - Java app for membership management
- [Software Security Project](https://github.com/StanStarishko/Portfolio/tree/main/Python/Software%20Security%20Project) - Python app with Google Maps API, AWS Lambda + S3 serverless storage, threat modeling, secure API key handling, automated testing
- [Abbington Farm](https://github.com/StanStarishko/Portfolio/tree/main/HTML-CSSR-JS/Abbington-Farm) - Responsive website, nothing fancy
- [Dnipro City](https://github.com/StanStarishko/CYF-ITD-HomeTown) - CodeYourFuture project

---

## Currently Learning

**Actively using:** CI/CD pipelines, advanced React patterns  
**Improving:** Microservices architecture (used it before, now modernising approach)  
**Want to learn:** Kubernetes, Spring Boot

Also trying to understand why JavaScript has 47 different ways to handle async operations.

---

## Quick Facts

```
🎓 HND Software Engineering (Year 2)
🚀 5 production projects in 2024-2026
✅ 100% test success on latest project (307/307 tests)
⚡ Built AI tool in 6 hours
📚 Learned Node.js in 2 weeks (course said 3 months)
🧪 TDD practitioner - test first, code second
🇺🇦 From Ukraine, living in Scotland since 2022
💼 15 years enterprise development experience
🎯 Looking for Software Engineer roles (junior to mid-level)
```

---

## What Sets Me Apart

**I delete code:** Removed 42 working tests from my latest project because they were noise. Each deletion documented with reasoning. Quality over quantity isn't just a slogan.

**I document failures:** My [Conservation project](https://github.com/StanStarishko/ClydeConservation) shows all 10 testing rounds - including the regressions, the architectural mistakes, and the hours spent debugging wrong solutions. Hiding mistakes teaches nothing.

**I make trade-offs:** Academic deadline approaching, 349 tests, 42 providing questionable value. Made the tough call: delete them based on evidence (duplicates, implementation details, library edge cases). Backed every decision with data.

**I question assumptions:** When test patterns repeated, didn't just fix symptoms - questioned if validators should check registry existence (they shouldn't - wrong layer). Architecture matters more than quick fixes.

---

## Education & Certs

**Glasgow Clyde College** - HND in Software Engineering (2024-2026)

**Professional Qualifications:**
- PDA in Full Stack Development (SCQF Level 8)
- PDA in Cyber Resilience (SCQF Level 8)
- PDA in Data Programming (SCQF Level 8)
- PDA in Software Development (SCQF Level 7)
- CyberOps Associate (Cisco)

Basically spent the last 2 years collecting certificates and actually learning things.

---

## Community Stuff

Volunteer at Glasgow Film Theatre for 2+ years (yes, I check tickets and clean up after shows - keeps me grounded).

Also volunteer with Ukrainian Employment Integration Project and CodeYourFuture alumnus.

---

## Languages

🇬🇧 English (B2 - good enough for arguing about code reviews)  
🇺🇦 Ukrainian (Native)  
🇷🇺 Russian (Native)

---

## What I'm Looking For

Software Engineer roles where:
- Fast learning matters more than having 5 years in the exact tech stack
- Problem-solving is valued over just shipping features
- People actually review code and care about quality
- Making tough engineering decisions is expected, not punished
- Junior/mid-level positions, apprenticeships, or graduate schemes

Not interested in:
- "Rock star ninja guru" job descriptions
- Places that think 60-hour weeks are normal
- Companies allergic to modern development practices
- Environments where questioning design decisions is seen as negativity

---

📍 Glasgow, Scotland, UK  
✅ Legally authorised to work in UK  
🚗 Driving Licence (Category B)

---

**Let's build something useful** 🚀

*Last updated: February 2026*
