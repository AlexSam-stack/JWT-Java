package com.example.demo_jwt.Demo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping(value = "demo", produces = MediaType.TEXT_HTML_VALUE)
    // Mapea POST a /api/v1/demo y produce contenido HTML
    public String welcome(){
        return """
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Aplicación Demo - JWT Autorizado</title>
                <style>
                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }

                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        background: linear-gradient(45deg, #1e3c72, #2a5298, #1e40af, #3b82f6);
                        background-size: 400% 400%;
                        animation: gradientShift 8s ease infinite;
                        min-height: 100vh;
                        display: flex;
                        align-items: center;
                        justify-content: center;
                        overflow: hidden;
                    }

                    @keyframes gradientShift {
                        0% { background-position: 0% 50%; }
                        50% { background-position: 100% 50%; }
                        100% { background-position: 0% 50%; }
                    }

                    .container {
                        position: relative;
                        text-align: center;
                        z-index: 2;
                    }

                    .main-title {
                        font-size: 4rem;
                        font-weight: 800;
                        color: white;
                        text-shadow: 0 0 30px rgba(255, 255, 255, 0.5);
                        margin-bottom: 2rem;
                        opacity: 0;
                        transform: translateY(50px);
                        animation: fadeInUp 1.5s ease forwards;
                    }

                    .subtitle {
                        font-size: 1.5rem;
                        color: rgba(0, 0, 0, 0.9);
                        margin-bottom: 3rem;
                        opacity: 0;
                        transform: translateY(30px);
                        animation: fadeInUp 2s ease forwards 0.5s;
                    }

                    @keyframes fadeInUp {
                        to {
                            opacity: 1;
                            transform: translateY(0);
                        }
                    }

                    .animated-cards {
                        display: flex;
                        justify-content: center;
                        gap: 2rem;
                        flex-wrap: wrap;
                        margin-bottom: 3rem;
                    }

                    .card {
                        background: rgba(255, 255, 255, 0.1);
                        backdrop-filter: blur(15px);
                        border: 1px solid rgba(255, 255, 255, 0.2);
                        border-radius: 20px;
                        padding: 2rem;
                        width: 250px;
                        height: 200px;
                        display: flex;
                        flex-direction: column;
                        align-items: center;
                        justify-content: center;
                        cursor: pointer;
                        transition: all 0.3s ease;
                        opacity: 0;
                        transform: scale(0.8) rotateY(180deg);
                        animation: cardFlipIn 1s ease forwards;
                    }

                    .card:nth-child(1) { animation-delay: 1s; }
                    .card:nth-child(2) { animation-delay: 1.3s; }
                    .card:nth-child(3) { animation-delay: 1.6s; }

                    @keyframes cardFlipIn {
                        to {
                            opacity: 1;
                            transform: scale(1) rotateY(0deg);
                        }
                    }

                    .card:hover {
                        transform: translateY(-10px) scale(1.05);
                        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.3);
                        background: rgba(255, 255, 255, 0.2);
                    }

                    .card-icon {
                        font-size: 3rem;
                        margin-bottom: 1rem;
                        animation: bounce 2s infinite;
                    }

                    .card:nth-child(2) .card-icon {
                        animation-delay: 0.3s;
                    }

                    .card:nth-child(3) .card-icon {
                        animation-delay: 0.6s;
                    }

                    @keyframes bounce {
                        0%, 20%, 50%, 80%, 100% {
                            transform: translateY(0);
                        }
                        40% {
                            transform: translateY(-15px);
                        }
                        60% {
                            transform: translateY(-7px);
                        }
                    }

                    .card-title {
                        color: white;
                        font-weight: 600;
                        font-size: 1.2rem;
                        margin-bottom: 0.5rem;
                    }

                    .card-text {
                        color: rgba(0, 0, 0, 0.8);
                        font-size: 0.9rem;
                        text-align: center;
                    }

                    .floating-elements {
                        position: absolute;
                        top: 0;
                        left: 0;
                        width: 100%;
                        height: 100%;
                        overflow: hidden;
                        z-index: 1;
                    }

                    .floating-element {
                        position: absolute;
                        background: rgba(255, 255, 255, 0.1);
                        border-radius: 50%;
                        animation: float 15s infinite linear;
                    }

                    .floating-element:nth-child(1) {
                        width: 100px;
                        height: 100px;
                        left: 10%;
                        animation-delay: 0s;
                    }

                    .floating-element:nth-child(2) {
                        width: 60px;
                        height: 60px;
                        left: 20%;
                        animation-delay: 2s;
                    }

                    .floating-element:nth-child(3) {
                        width: 80px;
                        height: 80px;
                        left: 70%;
                        animation-delay: 4s;
                    }

                    .floating-element:nth-child(4) {
                        width: 120px;
                        height: 120px;
                        left: 80%;
                        animation-delay: 6s;
                    }

                    .floating-element:nth-child(5) {
                        width: 40px;
                        height: 40px;
                        left: 50%;
                        animation-delay: 8s;
                    }

                    @keyframes float {
                        0% {
                            transform: translateY(100vh) rotate(0deg);
                            opacity: 0;
                        }
                        10% {
                            opacity: 1;
                        }
                        90% {
                            opacity: 1;
                        }
                        100% {
                            transform: translateY(-100px) rotate(360deg);
                            opacity: 0;
                        }
                    }

                    .success-badge {
                        display: inline-flex;
                        align-items: center;
                        background: rgba(34, 197, 94, 0.2);
                        border: 1px solid rgba(34, 197, 94, 0.3);
                        color: #10b981;
                        padding: 0.8rem 1.5rem;
                        border-radius: 50px;
                        font-weight: 600;
                        font-size: 1.1rem;
                        margin-bottom: 2rem;
                        opacity: 0;
                        transform: scale(0);
                        animation: popIn 0.8s ease forwards 2.5s;
                    }

                    @keyframes popIn {
                        0% {
                            transform: scale(0);
                            opacity: 0;
                        }
                        70% {
                            transform: scale(1.1);
                            opacity: 1;
                        }
                        100% {
                            transform: scale(1);
                            opacity: 1;
                        }
                    }

                    .pulse-ring {
                        position: absolute;
                        top: 50%;
                        left: 50%;
                        transform: translate(-50%, -50%);
                        width: 300px;
                        height: 300px;
                        border: 2px solid rgba(255, 255, 255, 0.3);
                        border-radius: 50%;
                        animation: pulse 3s infinite;
                        z-index: 0;
                    }

                    .pulse-ring:nth-child(2) {
                        animation-delay: 1s;
                        width: 400px;
                        height: 400px;
                    }

                    .pulse-ring:nth-child(3) {
                        animation-delay: 2s;
                        width: 500px;
                        height: 500px;
                    }

                    @keyframes pulse {
                        0% {
                            transform: translate(-50%, -50%) scale(0.8);
                            opacity: 1;
                        }
                        100% {
                            transform: translate(-50%, -50%) scale(1.2);
                            opacity: 0;
                        }
                    }

                    .interactive-button {
                        background: linear-gradient(135deg, #10b981, #059669);
                        color: white;
                        border: none;
                        padding: 1rem 2rem;
                        border-radius: 50px;
                        font-size: 1.1rem;
                        font-weight: 600;
                        cursor: pointer;
                        transition: all 0.3s ease;
                        position: relative;
                        overflow: hidden;
                        opacity: 0;
                        transform: translateY(30px);
                        animation: fadeInUp 1s ease forwards 3s;
                    }

                    .interactive-button:hover {
                        transform: translateY(-5px);
                        box-shadow: 0 10px 25px rgba(16, 185, 129, 0.4);
                    }

                    .interactive-button:active {
                        transform: translateY(-2px);
                    }

                    .interactive-button::before {
                        content: '';
                        position: absolute;
                        top: 0;
                        left: -100%;
                        width: 100%;
                        height: 100%;
                        background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.2), transparent);
                        transition: left 0.5s;
                    }

                    .interactive-button:hover::before {
                        left: 100%;
                    }

                    @media (max-width: 768px) {
                        .main-title {
                            font-size: 2.5rem;
                        }
                        
                        .animated-cards {
                            flex-direction: column;
                            align-items: center;
                        }
                        
                        .card {
                            width: 90%;
                            max-width: 300px;
                        }
                    }
                </style>
            </head>
            <body>
                <div class="floating-elements">
                    <div class="floating-element"></div>
                    <div class="floating-element"></div>
                    <div class="floating-element"></div>
                    <div class="floating-element"></div>
                    <div class="floating-element"></div>
                </div>

                <div class="pulse-ring"></div>
                <div class="pulse-ring"></div>
                <div class="pulse-ring"></div>

                <div class="container">
                    <div class="success-badge">
                        ✅ Acceso Autorizado
                    </div>
                    
                    <h1 class="main-title">¡Bienvenido!</h1>
                    <p class="subtitle">Has accedido exitosamente al área protegida</p>
                    
                    <div class="animated-cards">
                        <div class="card">
                            <div class="card-icon">🔐</div>
                            <div class="card-title">Seguridad</div>
                            <div class="card-text">Tu token JWT ha sido validado correctamente</div>
                        </div>
                        
                        <div class="card">
                            <div class="card-icon">⚡</div>
                            <div class="card-title">Rendimiento</div>
                            <div class="card-text">Aplicación optimizada con Spring Boot</div>
                        </div>
                        
                        <div class="card">
                            <div class="card-icon">🚀</div>
                            <div class="card-title">Innovación</div>
                            <div class="card-text">Tecnología moderna y escalable</div>
                        </div>
                    </div>
                    
                    <button class="interactive-button" onclick="showMessage()">
                        Explorar Funcionalidades
                    </button>
                </div>

                <script>
                    function showMessage() {
                        const messages = [
                            '¡Genial! Tu autenticación JWT funciona perfectamente 🎉',
                            '¡Acceso autorizado! El sistema de seguridad está activo 🔒',
                            '¡Éxito! Has demostrado que el token es válido ✨',
                            '¡Impresionante! La integración está funcionando 🚀'
                        ];
                        
                        const randomMessage = messages[Math.floor(Math.random() * messages.length)];
                        
                        // Crear elemento de notificación
                        const notification = document.createElement('div');
                        notification.style.cssText = `
                            position: fixed;
                            top: 20px;
                            right: 20px;
                            background: linear-gradient(135deg, #10b981, #059669);
                            color: white;
                            padding: 1rem 1.5rem;
                            border-radius: 10px;
                            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
                            z-index: 1000;
                            transform: translateX(400px);
                            transition: transform 0.5s ease;
                            max-width: 300px;
                            font-weight: 600;
                        `;
                        notification.textContent = randomMessage;
                        
                        document.body.appendChild(notification);
                        
                        // Animar entrada
                        setTimeout(() => {
                            notification.style.transform = 'translateX(0)';
                        }, 100);
                        
                        // Animar salida y remover
                        setTimeout(() => {
                            notification.style.transform = 'translateX(400px)';
                            setTimeout(() => {
                                document.body.removeChild(notification);
                            }, 500);
                        }, 3000);
                    }

                    // Agregar efectos de partículas al hacer clic
                    document.addEventListener('click', function(e) {
                        createParticles(e.clientX, e.clientY);
                    });

                    function createParticles(x, y) {
                        for (let i = 0; i < 6; i++) {
                            const particle = document.createElement('div');
                            particle.style.cssText = `
                                position: fixed;
                                width: 6px;
                                height: 6px;
                                background: white;
                                border-radius: 50%;
                                pointer-events: none;
                                z-index: 9999;
                                left: ${x}px;
                                top: ${y}px;
                            `;
                            
                            document.body.appendChild(particle);
                            
                            const angle = (Math.PI * 2 * i) / 6;
                            const velocity = 2 + Math.random() * 3;
                            
                            let dx = Math.cos(angle) * velocity;
                            let dy = Math.sin(angle) * velocity;
                            let life = 30;
                            
                            const animate = () => {
                                life--;
                                if (life <= 0) {
                                    document.body.removeChild(particle);
                                    return;
                                }
                                
                                x += dx;
                                y += dy;
                                dy += 0.1; // gravedad
                                
                                particle.style.left = x + 'px';
                                particle.style.top = y + 'px';
                                particle.style.opacity = life / 30;
                                
                                requestAnimationFrame(animate);
                            };
                            
                            animate();
                        }
                    }
                </script>
            </body>
            </html>
            """;
    }
}