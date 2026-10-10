class Configuration:
    __instance = None

    def __new__(cls):
        if cls.__instance is None:
            cls.__instance = super().__new__(cls)
            cls.__instance.appName = "ECS160-HW1"
            cls.__instance.logLevel = "INFO"
            cls.__instance.maxConnections = 32
            cls.__instance.debugMode = True
        return cls.__instance

    @classmethod
    def get_instance(cls):
        return cls()
