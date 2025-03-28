# Автоматизация сайта Россельхоз Банк
[Россельхоз Банк](https://www.rshb.ru/)

---

## 📄 Проект включает в себя:

---
Технологии и инструменты  
Реализованные проверки   
Сборка в Jenkins  
Параметры сборки в Jenkins  
Пример Allure отчета  
Уведомления в Telegram с использованием бота

## 💻 Технологии и инструменты:

---
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="Jetbrains" src="Images/icons/Intelij_IDEA.svg"></a>
<a href="https://www.java.com/ru/"><img width="6%" title="Java" src="Images/icons/Java.svg"></a>
<a href="https://github.com"><img width="6%" title="GitHub" src="Images/icons/Github.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit" src="Images/icons/JUnit5.svg"></a>
<a href="https://gradle.org"><img width="6%" title="Gradle" src="Images/icons/Gradle.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="Images/icons/Selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="Images/icons/Selenoid.svg"></a>
<a href="https://allurereport.org"><img width="6%" title="Allure" src="Images/icons/Allure.svg"></a>
<a href="https://jenkins.autotests.cloud"><img width="6%" title="Jenkins" src="Images/icons/Jenkins.svg"></a>
<a href="https://https://web.telegram.org"><img width="6%" title="Telegram" src="Images/icons/Telegram.svg"></a>





[//]: # (<img src="Images/icons/Intelij_IDEA.svg" height="48" width="48" /> <a href="https://www.jetbrains.com/idea/">)
[//]: # (<img href="https://www.java.com/ru/" src="Images/icons/Java.svg" height="48" width="48" />)
[//]: # (<img href="https://github.com" src="Images/icons/Github.svg" height="48" width="48" />)
[//]: # (<img href="https://junit.org/junit5/" src="Images/icons/JUnit5.svg" height="48" width="48" />)
[//]: # (<img href="https://gradle.org" src="Images/icons/Gradle.svg" height="48" width="48" />)
[//]: # (<img href="https://selenide.org" src="Images/icons/Selenide.svg" height="48" width="48" />)
[//]: # (<img href="https://aerokube.com/selenoid/" src="Images/icons/Selenoid.svg" height="48" width="48" />)
[//]: # (<img href="https://allurereport.org" src="Images/icons/Allure.svg" height="48" width="48" />)
[//]: # (<img href="https://jenkins.autotests.cloud" src="Images/icons/Jenkins.svg" height="48" width="48" />)
[//]: # (<img href="https://https://web.telegram.org" src="Images/icons/Telegram.svg" height="48" width="48" />)

## ✅ Реализованные проверки:

---
Проверка вкладок меню при открытии главной страницы  
Проверка возможности выбора филиала Свердловск  
Проверка количества офисов и банкоматов в Свердловской области  
Проверка перехода на страницу Частные клиенты  
Проверка незаполненного кредита и вывод модельного окна

## ▶️ Сборка в Jenkins:

---
Перейти по [ссылке](https://jenkins.autotests.cloud/job/MyHomeWorkTestRshb/)  
<p align="left">
<img src="Images/image/Jenkins.png" />

Для запуска сборки необходимо кликнуть на "Build with parameters"  
<p align="left">
<img src="Images/image/Jenkins.png" />  

## 🏷️ Параметры сборки в Jenkins:

---
browser (браузер, по умолчанию chrome)  
browserVersion (версия браузера, по умолчанию 127)  
browserSize (размер окна браузера, по умолчанию 1920x1080)

## 📊 Пример отчета в Allure:

---
Для просмотре перейти по [ссылке](https://jenkins.autotests.cloud/job/MyHomeWorkTestRshb/18/allure/)  
Результаты выполнения тестов:  
<p align="left">
<img src="Images/image/Allure.png" />  



Видео с результатом одного выполненного теста:
<p align="left">
<img src="Images/gif/allure-result_1.gif" />  

## 🔔 Уведомление в Telegram с использованием бота:

---
После завершения сборки Telegram-бот автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов
<p align="left">
<img src="Images/image/Telegram.png" />  
