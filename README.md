README 😃
Добро пожаловать в проект, который состоит из трёх заданий, демонстрирующих применение различных паттернов проектирования и принципов SOLID! Каждый модуль выполнен отдельно и находится в своём пакете. Вы можете запускать каждое задание независимо или интегрировать их по своему желанию.

📚 Содержание
Smart Home Control System (Advanced – 100 points)
Online Payment Gateway (Intermediate – 60 points)
Coffee Shop Simulator (Easy – 40 points)
Структура проекта
Компиляция и запуск
Принципы SOLID и применённые паттерны
🏠 Smart Home Control System
Описание:
Этот модуль демонстрирует управление умными устройствами с применением нескольких паттернов проектирования:

Composite: Организация устройств в группы (комнаты, этажи).
Decorator: Динамическое расширение функциональности (например, планировщик операций).
Abstract Factory: Создание семейств устройств (Basic vs. Advanced).
Facade: Упрощённое управление через единый контроллер.
Adapter: Интеграция с устаревшими системами (например, система дверных замков).
Ключевые файлы:

SmartDevice.java
CompositeDevice.java
Light.java, Thermostat.java, SecurityCamera.java
DeviceDecorator.java, ScheduledOperationDecorator.java
SmartHomeFactory.java, BasicSmartHomeFactory.java, AdvancedSmartHomeFactory.java
SmartHomeController.java
LegacyDoorLockSystem.java, DoorLockAdapter.java
SmartHomeDemo.java
💳 Online Payment Gateway
Описание:
Модуль представляет собой платежную систему, поддерживающую несколько способов оплаты. Для унификации интерфейса используется паттерн Adapter для интеграции с устаревшим API PayPal.
Основные паттерны:

Factory Method: Создание объектов для различных способов оплаты.
Adapter: Интеграция с LegacyPayPalAPI.
Ключевые файлы:

PaymentMethod.java
PaymentStatus.java
Transaction.java
PaymentFactory.java
CreditCardPayment.java, CryptoPayment.java
LegacyPayPalAPI.java, PayPalPaymentAdapter.java
PaymentGatewayDemo.java
Пакет:
Все файлы находятся в пакете paymentmethod.

☕ Coffee Shop Simulator
Описание:
Этот модуль симулирует процесс заказа кофе с возможностью добавления дополнительных ингредиентов. Применяются следующие паттерны:

Factory Method: Создание базового кофе (Espresso, Cappuccino, Latte, Americano).
Decorator: Динамическое добавление топпингов (молоко, карамель, взбитые сливки, шоколад).
Ключевые файлы:

Coffee.java
Espresso.java, Cappuccino.java, Latte.java, Americano.java
CoffeeFactory.java
CoffeeDecorator.java
MilkDecorator.java, CaramelDecorator.java, WhippedCreamDecorator.java, ChocolateDecorator.java
CoffeeShopDemo.java
Пакет:
Все файлы находятся в пакете coffeeshop.

🗂 Структура проекта
Проект разделён на следующие пакеты для обеспечения модульности:

smarthome:
Содержит файлы, связанные с системой Smart Home Control System.

paymentmethod:
Содержит файлы, связанные с Online Payment Gateway.

coffeeshop:
Содержит файлы, связанные с Coffee Shop Simulator.

Каждый файл начинается с объявления пакета, например:

java
Копировать
Редактировать
package smarthome;
🚀 Компиляция и запуск
Компиляция:
Убедитесь, что структура каталогов соответствует пакетам. Для компиляции всех файлов из корневой директории проекта используйте команду (пример для JDK):

bash
Копировать
Редактировать
javac -d bin $(find . -name "*.java")
Запуск отдельных приложений:

Smart Home Control System:
Запустите класс smarthome.SmartHomeDemo:

bash
Копировать
Редактировать
java -cp bin smarthome.SmartHomeDemo
Online Payment Gateway:
Запустите класс paymentmethod.PaymentGatewayDemo:

bash
Копировать
Редактировать
java -cp bin paymentmethod.PaymentGatewayDemo
Coffee Shop Simulator:
Запустите класс coffeeshop.CoffeeShopDemo:

bash
Копировать
Редактировать
java -cp bin coffeeshop.CoffeeShopDemo
⚙️ Принципы SOLID и применённые паттерны
Single Responsibility (SRP):
Каждый класс выполняет свою конкретную задачу (например, отдельные классы для создания устройств, декораторы, адаптеры).

Open/Closed (OCP):
Система легко расширяется добавлением новых классов (новые декораторы, методы оплаты и т.д.) без изменения существующего кода.

Liskov Substitution (LSP):
Все реализации интерфейсов (например, SmartDevice, PaymentMethod, Coffee) можно использовать взаимозаменяемо.

Interface Segregation (ISP):
Интерфейсы содержат только необходимые методы для конкретных задач.

Dependency Inversion (DIP):
Высокоуровневые модули зависят от абстракций, что облегчает замену компонентов и тестирование.

Применённые паттерны:

Smart Home Control System: Composite, Decorator, Abstract Factory, Facade, Adapter.
Online Payment Gateway: Factory Method, Adapter.
Coffee Shop Simulator: Factory Method, Decorator.
