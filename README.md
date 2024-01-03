# LaTeX template repository with continuous integration  

[![Build LaTeX and deploy on GitHub Releases](https://github.com/DanySK/Template-LaTeX-CI/actions/workflows/build-and-deploy-latex.yml/badge.svg)](https://github.com/DanySK/Template-LaTeX-CI/actions/workflows/build-and-deploy-latex.yml)

This repository is meant to be used as template for quickly starting LaTeX projects,
having them built on a continuous integrator, and having them quickly deployed in GitHub releases.

The build system is based on Gradle, using [the latex-gradle plugin](https://github.com/DanySK/gradle-latex).

The file being built is a LaTeX quick reference by [Mark Gates](http://www.icl.utk.edu/~mgates3/), kudos to him.

## Using the project

1. Create a new repo using the "Use this template" button
2. Delete existing tex files and add yours

**IMPORTANT**: Make sure to have a magic comment like `% !TeX root = somefile.tex` in the header of any `tex` file that is not meant to be compiled!

## Contributing to the project

I gladly review pull requests and I'm happy to improve the work.
If the software was useful to you, please consider supporting my development activity
[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donate_SM.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=5P4DSZE5DV4H2&currency_code=EUR)
