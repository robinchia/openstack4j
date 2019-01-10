OpenStack4j
===========

[![Build Status](https://travis-ci.org/ContainX/openstack4j.svg?branch=master)](https://travis-ci.org/ContainX/openstack4j)  [![License](https://img.shields.io/badge/license-Apache%202-blue.svg)]()

OpenStack4j is a fluent OpenStack client that allows provisioning and control of an OpenStack deployment.   This includes support for Identity, Compute, Image, Network, Block Storage, Telemetry, Data Processing as well as many extensions (LBaaS, FWaaS, Quota-Sets, etc)

## Fix bugs
   Openstack4j fix bug so slowly.I change some code for heat endpoint. And update code.
*   1.Fix template bug. Add TemplateValidate bean class and change TemplateResponse class.
*   2.Add the fixed ip in network.
*   3.Add router HA function. 
*   4.Add catch invokeRequest function error.
*   5.Add get serial url function.
## Documentation and Support

* Website: [OpenStack4j.com](http://www.openstack4j.com)
* Documentation/Tutorials: [OpenStack4j.com/learn/](http://www.openstack4j.com/learn/)
* Questions - Use Google Groups: [groups.google.com/group/openstack4j](http://groups.google.com/group/openstack4j)
* Questions - [Stackoverflow](http://stackoverflow.com/search?q=openstack4j)
* Chat on Slack: [containx.slack.com](https://containx.slack.com)
* Twitter: [@openstack4j](https://twitter.com/openstack4j)
* Changelog: [Changelog](https://github.com/ContainX/openstack4j/blob/master/CHANGELOG.md)

## Bug Reports

* GitHub Issues: [Click Here](https://github.com/ContainX/openstack4j/issues)

## Requirements

* OpenStack4j 3.0.X - Java 7 (JDK 8 preferred)
* OpenStack4j 2.0.X - Java 7

Maven
-----

#### Latest Release (Stable)

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pacesys/openstack4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pacesys/openstack4j)

OpenStack4j version 2.0.0+ is now modular.  One of the benefits to this is the ability to choose the connector that you would like to use in your environment.  

**Using OpenStack4j with the default Jersey2 Connector**
```xml
<dependency>
    <groupId>org.pacesys</groupId>
    <artifactId>openstack4j</artifactId>
    <version>3.1.0</version>
</dependency>
```

**Using OpenStack4j with one of our connector modules**

To configure OpenStack4j to use one of our supported connectors (Jersey 2, Resteasy, Apache HttpClient, OKHttp) [see the usage guide](https://github.com/ContainX/openstack4j/tree/master/connectors)

#### Current (Master Branch)

See notes above about connectors (same rules apply) to development branches.  

```xml
<dependency>
    <groupId>org.pacesys</groupId>
    <artifactId>openstack4j</artifactId>
    <version>3.1.1-SNAPSHOT</version>
</dependency>
```

**A note about referencing Snapshots without Source**

Snapshots are deploys to sonatype.  We automatically deploy snapshots on every merge into the master branch.  Typically 5 - 10 snapshot releases before an official release.

You will need to add the repository to your POM or Settings file.  Releases (above) are deployed to maven central and this step is not required.

Example POM based repository declaration to grab snapshots:
```xml
<repositories>
    <repository>
      <id>st-snapshots</id>
      <name>sonatype-snapshots</name>
      <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
</repositories>
```

