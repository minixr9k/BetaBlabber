# 🚀 Minecraft Beta 1.7.3 Chat Bot

BetaBlabber

Welcome to **BetaBlabber**, a slick Java bot for Minecraft Beta 1.7.3! This chatty bot connects to your server, drops messages like a pro, and stays online without getting kicked. Perfect for adding some retro flair to your Minecraft server!

## 🌟 Features
- Connects to Minecraft Beta 1.7.3 servers (protocol version 14).
- Sends chat messages with style.
- Keeps the connection alive with periodic position updates.
- Lightweight and ready to roll.

## 🔮 Planned Features
BetaBlabber is just warming up! Here's what's coming:
- 🛠️ **Block Interaction**: Digging and placing blocks like a master builder.
- 🏃 **Player Following**: Tailing your friends for some sneaky fun.
- ⚔️ **Combat Mode**: Auto-attacking mobs or players (creepers beware!).
- 📜 **Custom Commands**: Trigger bot actions via chat commands.
- And more epic features to make BetaBlabber the ultimate Beta 1.7.3 companion!

## 🛠️ Requirements
- Java 17 or higher.
- A Minecraft Beta 1.7.3 server (e.g., `127.0.0.1:25565`).
- A love for pixelated nostalgia!

## 📦 Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/minixr9k/BetaBlabber.git
   ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA).
3. Build the project using your IDE or a build tool like Maven/Gradle (if configured).
4. Update the server details in `Main.java`:
    - Host: `127.0.0.1`
    - Port: `25565`
    - Username: Pick a dope bot name (e.g., `BotName`).
5. Run the `Main` class to unleash the bot.

## 🎮 Usage
- The bot connects to the server and sends two test messages: "Hello world!" and "Test".
- Customize `Main.java` to send your own messages via `bot.sendMessage("Your message here!");`.
- Watch BetaBlabber dominate the chat!

## 💻 Code Overview
- **Main.java**: Entry point, sets up the bot with server details and sends initial messages.
- **MinecraftBot.java**: Core bot logic, handles server connection, packet processing, and chat messages.
- **Packets**: Custom packet classes (`Packet1Login`, `Packet2Handshake`, `Packet3ChatMessage`, `Packet13PlayerPositionLook`) for Minecraft Beta 1.7.3 protocol.

## ⚠️ Notes
- Ensure the server is running Minecraft Beta 1.7.3 (protocol version 14).
- No external dependencies are required, but keep your Java version compatible.
- Sensitive data like server IPs should be stored securely (e.g., in a config file ignored by `.gitignore`).

## 🤝 Contributing
Want to make BetaBlabber even more awesome? Fork the repo, add your magic, and submit a pull request!

## 📜 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Crafted with 💥 by [minixr9k](https://github.com/minixr9k) for the Minecraft Beta 1.7.3 community. Let's keep the retro vibes alive and make this bot legendary! 🎮