sequenceDiagram
    participant User
    participant WebBrowser
    participant WebServer
    participant AuthService
    participant VideoService

    User->>WebBrowser: Access Video Conferencing App
    WebBrowser->>WebServer: Request Homepage
    WebServer-->>WebBrowser: Load Homepage
    User->>WebServer: Log In
    WebServer->>AuthService: Authenticate User
    AuthService-->>WebServer: Return Authentication Token
    WebServer-->>User: User Authenticated

    User->>WebServer: Create/Join Meeting
    WebServer->>VideoService: Initialize Meeting
    VideoService-->>WebServer: Meeting Initialized
    WebServer-->>User: Provide Meeting Link

    User->>VideoService: Connect to Meeting
    VideoService-->>User: Connect Audio/Video
    User->>VideoService: Send Audio/Video Stream
    VideoService-->>User: Receive Audio/Video Stream

    User->>WebServer: Send Message
    WebServer-->>User: Display Message

    User->>VideoService: Enable Whiteboard
    VideoService-->>User: Display Whiteboard

    User->>VideoService: Upload Document
    VideoService-->>User: Display Document for Co-editing
