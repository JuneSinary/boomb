<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>温馨提示 - ${status!500}</title>
    <style>
        body {
            margin: 0;
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto;
            background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .error-container {
            background: white;
            padding: 2rem 3rem;
            border-radius: 12px;
            box-shadow: 0 8px 24px rgba(0,0,0,0.1);
            text-align: center;
        }
        .error-code {
            font-size: 4rem;
            font-weight: bold;
            color: #e74c3c;
            margin: 0;
        }
        .error-message {
            font-size: 1.2rem;
            color: #2c3e50;
            margin: 1rem 0;
        }
        .home-button {
            display: inline-block;
            padding: 0.8rem 1.5rem;
            background: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 6px;
            transition: background 0.3s;
        }
        .home-button:hover {
            background: #2980b9;
        }
        .love-text {
            margin-top: 1rem;
            color: #e74c3c;
            font-size: 0.9rem;
        }
    </style>
</head>
<body>
<div class="error-container">
    <h1 class="error-code">${status!500}</h1>
    <p class="error-message">${message!'暂时无法为您提供服务'}</p>
    <a href="/" class="home-button">返回首页</a>
    <p class="love-text">整个的心，放在你手中，陪你到永久 ❤️</p>
</div>
</body>
</html>