def call() {
    // Checkout the repository from GitHub with the 'main' branch
    echo "Cloning repository from https://github.com/MariamWafik349/FinalProjectCode"
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']],  // Specify the branch
        doGenerateSubmoduleConfigurations: false,
        extensions: [],
        userRemoteConfigs: [[url: 'https://github.com/MariamWafik349/FinalProjectCode']]
    ])
}
