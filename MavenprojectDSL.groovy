job('First MAven Job through DSL') {
description("First maven job generated through a DSL on ${new Date()}, the project is a maven project hosted on github")
scm {
    git("git@github.com:miruthula98/sample_demo.git")
}
triggers {
    scm('* * * * *')
}
steps {
    maven(sampleproject/pom.xml)
}
publishers {
    archiveArtifacts '**/*.jar'
}
}
