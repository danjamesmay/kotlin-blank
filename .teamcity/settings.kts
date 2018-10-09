import jetbrains.buildServer.configs.kotlin.v2018_1.*

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2018.1"

project {
    description = "Contains all other projects"

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "ReportTab"
            param("startPage", "coverage.zip!index.html")
            param("title", "Code Coverage")
            param("type", "BuildReportTab")
        }
        feature {
            id = "PROJECT_EXT_4"
            type = "OAuthProvider"
            param("clientId", "c03692ea2bf71b8e9c29")
            param("defaultTokenScope", "public_repo,repo,repo:status,write:repo_hook")
            param("secure:clientSecret", "credentialsJSON:9bea5204-bbf3-4888-895c-c4ccb27b5794")
            param("displayName", "danjamesmay")
            param("gitHubUrl", "https://github.com/")
            param("providerType", "GitHub")
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
}
