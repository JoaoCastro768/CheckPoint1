# 🚀 CheckPoint 1

Projeto desenvolvido para a disciplina **Microservices and Web Engineering**, com foco em navegação no Android utilizando **Jetpack Compose Navigation** e passagem de parâmetros entre telas.

---

## 📱 Sobre o Projeto

Este projeto demonstra diferentes formas de navegação entre telas em um aplicativo Android, incluindo:

- Passagem de parâmetros obrigatórios
- Passagem de parâmetros opcionais
- Uso de múltiplos parâmetros
- Tipagem de argumentos na navegação

O objetivo é simular cenários reais de aplicações, onde telas precisam receber dados dinâmicos.

---

## 🛠️ Tecnologias Utilizadas

- Kotlin
- Android Studio
- Jetpack Compose
- Navigation Compose

---

## 📌 Funcionalidades

### 🔹 Tela de Perfil (Parâmetro Obrigatório)

- Recebe o nome do usuário via rota
- Exibe o nome dinamicamente na tela

Exemplo de navegação:

```kotlin
navController.navigate("perfil/Fulano de Tal")
🔹 Tela de Pedidos (Parâmetro Opcional)
Recebe o nome do cliente opcionalmente
Caso não seja informado, utiliza um valor padrão

Exemplo com parâmetro:

navController.navigate("pedidos?cliente=João")

Exemplo sem parâmetro:

navController.navigate("pedidos")
🔹 Múltiplos Parâmetros
A tela de Perfil também recebe idade
Demonstra uso de diferentes tipos (String + Int)

Exemplo:

navController.navigate("perfil/Fulano de Tal/27")
🔄 Fluxo da Aplicação
Usuário acessa o menu principal
Escolhe uma opção (Perfil ou Pedidos)
O sistema navega passando parâmetros pela rota
A tela de destino exibe os dados recebidos
▶️ Como Executar
Clone o repositório:
git clone https://github.com/JoaoCastro768/CheckPoint1.git
Abra no Android Studio
Execute o projeto em um emulador ou dispositivo físico
📂 Estrutura do Projeto
📦 app
 ┣ 📂 ui
 ┃ ┣ 📜 MenuScreen.kt
 ┃ ┣ 📜 PerfilScreen.kt
 ┃ ┗ 📜 PedidosScreen.kt
 ┣ 📜 MainActivity.kt
⚠️ Observações Técnicas
Parâmetros obrigatórios são definidos diretamente na rota ({param})
Parâmetros opcionais utilizam query string (?param=)
Uso de navArgument para definir valores padrão e tipos
Tipagem explícita com NavType para evitar erros de conversão
👨‍💻 Autor

João Castro

GitHub: https://github.com/JoaoCastro768
