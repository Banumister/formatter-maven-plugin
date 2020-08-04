formatter-maven-plugin
======================

[![mvn verify][ci_img]][ci_link] [![Maven Central][maven_img]][maven_link]
[![Issues][issues_img]][issues_link] [![Apache License][license_img]][license_link]

This project provides a mechanism to automatically (re)format your [Maven]
project during a Maven build, or to verify its formatting, so that your project
can converge on consistent code style regardless of user preferences, IDE
settings, etc.

It began following a post on the topic (which can be found [here][blog]; thanks
to John for writing such a helpful article). It now uses the [Eclipse] code
formatter for Java, and has grown to support formatting of other file types as
well.

For a companion [m2e] project configurator, see [formatter-m2e-configurator].

This software is provided WITHOUT ANY WARRANTY, and is available under the
Apache License, Version 2. Any code loss caused by using this plugin is not the
responsibility of the author(s). Be sure to use some source repository
management system such as GIT before using this plugin.

Contributions are welcome.

## How to use

View the Maven plugin documentation for the latest release [here][plugin-docs].

## Eclipse Compatibility

The primary use case of this plugin is to ensure consistent formatting for a
project, regardless of differences between IDE preferences or IDE versions that
developers use. Nevertheless, some users may find it useful to correlate
versions of this plugin to the version of Eclipse whose code is used as the
basis for this plugin's formatting. See [the wiki][compat] for a list of recent
versions of this plugin and their corresponding Eclipse versions.

[Eclipse]: https://eclipse.org
[Maven]: https://maven.apache.org
[blog]: http://ssscripting.wordpress.com/2009/06/10/how-to-use-the-eclipse-code-formatter-from-your-code/
[ci_img]: https://github.com/revelc/formatter-maven-plugin/workflows/mvn%20verify/badge.svg
[ci_link]: https://github.com/revelc/formatter-maven-plugin/actions
[compat]: https://github.com/revelc/formatter-maven-plugin/wiki/Eclipse-Version-Compatibility
[formatter-m2e-configurator]: https://github.com/revelc/formatter-m2e-configurator
[issues_img]: https://img.shields.io/github/issues/revelc/formatter-maven-plugin.svg
[issues_link]: https://github.com/revelc/formatter-maven-plugin/issues
[license_img]: http://img.shields.io/badge/license-ASL-blue.svg
[license_link]: https://github.com/revelc/formatter-maven-plugin/blob/master/LICENSE
[m2e]: https://eclipse.org/m2e
[maven_img]: https://maven-badges.herokuapp.com/maven-central/net.revelc.code.formatter/formatter-maven-plugin/badge.svg
[maven_link]: https://maven-badges.herokuapp.com/maven-central/net.revelc.code.formatter/formatter-maven-plugin
[plugin-docs]: http://code.revelc.net/formatter-maven-plugin/
[related1]: http://wiki.eclipse.org/M2E_extension_development_environment
[related2]: http://wiki.eclipse.org/Submitting_M2E_marketplace_entries
[related3]: http://www.eclipse.org/forums/index.php/t/478639/0/unread/
[related4]: http://www.vogella.com/articles/EclipsePreferences/article.html
