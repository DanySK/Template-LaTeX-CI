# LaTeX template repository with continuous integration  

[![Build Status](https://travis-ci.org/DanySK/Template-LaTeX-CI.svg?branch=master)](https://travis-ci.org/DanySK/Template-LaTeX-CI)

This repository is meant to be used as template for quickly starting LaTeX projects,
having them built on a continuous integrator, and having them quickly deployed in GitHub releases.

The build system is based on Gradle, using [the latex-gradle plugin](https://github.com/DanySK/gradle-latex).

The file being built is a LaTeX quick reference by [Mark Gates](http://www.icl.utk.edu/~mgates3/), kudos to him.

## Using the project

1. Create a new repo using the "Use this template" button
2. Delete existing tex files and add yours
3. Configure the build inside `build.gradle.kts` following instructions on [https://github.com/DanySK/gradle-latex](https://github.com/DanySK/gradle-latex)
4. Test your build locally by `./gradlew buildLatex`
3. Update the `.gitignore` file ignoring the generated files
6. Modify the `token` entry in the `deployment` section of `.travis.yml`, following [the instructions for deployment on GitHub releases provided by Travis](https://docs.travis-ci.com/user/deployment/releases/).
7. Enable your repo on Travis CI (if you are using .org, otherwise it should get built automatically from start)
8. Just write, commit, and push, and in few minutes your files will be automagically available on GitHub.

## Contributing to the project

I gladly review pull requests and I'm happy to improve the work.
If the software was useful to you, please consider supporting my development activity
[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donate_SM.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=5P4DSZE5DV4H2&currency_code=EUR)
