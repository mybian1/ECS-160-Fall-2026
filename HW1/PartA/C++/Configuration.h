#ifndef CONFIGURATION_H
#define CONFIGURATION_H

#include <string>

class Configuration {
public:
    static Configuration& getInstance();

    Configuration(const Configuration&) = delete;
    Configuration& operator=(const Configuration&) = delete;
    Configuration(Configuration&&) = delete;
    Configuration& operator=(Configuration&&) = delete;

private:
    Configuration();

    std::string appName;
    std::string logLevel;
    int maxConnections;
    bool debugMode;
};

#endif
