def gitUrl = 'https://github.com/massinissamohellebi/JenkinsTpNode.git'

job('test-job') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/5 * * * *')
    }
    steps {
        shell('npm install')
        shell('npm test')
    }
}