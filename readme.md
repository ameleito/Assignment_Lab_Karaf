<h1>Purpuse</h1>
This repository contains the projects and tools to resolve the assignment homework for Advanced Camel Development with  Red Hat Fuse course.
of course, we include a complete description about how to clone, make the deploy in a fabric environment. We got another option is to build another project for spring-boot, but in this first part, we discuss how to make de deploy in a fabric container with deploy in the root container.

<h1>Request</h1>

For this work we need a fabric running, we test our development with JBoss Fuse 6.3 this one will be suggested to have the same behavior without issues,
we need this installation with access to repository local like maven, of course, this option is configurable inside the profile default making the modification
inside the file io.fabric8.agent.properties search the parameter org.ops4j.pax.url.mvn.defaultRepositories and org.ops4j.pax.url.mvn.repositories and we put
the way you must have these parameters defined.

org.ops4j.pax.url.mvn.defaultRepositories= \
    file:${user.home}/.m2/repository@snapshots@id=local, \
    file:${runtime.home}/${karaf.default.repository}@snapshots@id=karaf-default, \
    file:${runtime.data}/maven/upload@snapshots@id=fabric-upload, \
    file:${user.home}/.m2/repository@snapshots@id=local

org.ops4j.pax.url.mvn.repositories= \
    file:${user.home}/.m2/repository@snapshots@id=local, \
    http://repo1.maven.org/maven2@id=maven.central.repo, \
    https://maven.repository.redhat.com/ga@id=redhat.ga.repo, \
    https://maven.repository.redhat.com/earlyaccess/all@id=redhat.ea.repo, \
    https://repository.jboss.org/nexus/content/groups/ea@id=fuseearlyaccess


The other Requirement is to have a postman installed to use the request you will find in the file AssigmentCamel.json

<h1>Step by Step</h1>

<h2>1. Cloning</h2>

Obviously, the first step is going to get or clone our repo for this option we need to execute the next command.

    git clone https://github.com/ameleito/Assignment_Lab_Karaf.git

<h2>2. Import profile </h2>

To enable the bundles inside fabric we have to follow the next steps.

2.1 connect to fabric.

        <FUSE_HOME>/bin/client

2.2 import profile with command:

        profile-import --version <version_fabric> file:///<Repository_Home>/assigmentLab.zip

example:

        profile-import --version 1.0 file:///home/jamezqui/testProject/Assignment_Lab_Karaf/assigmentLab.zip

        the result for this command will be something like:

        Imported profiles into version 1.0

2.3 Verifying the profile in fabric, to do that we will use the command:

        profile-list |grep -i assigmentLab

the result must be something like.

        assigmentLab                     1               default feature-camel mq-amq

<h2>3.     Install the projects inside your maven local repository.</h2>

We need to create our artifacts inside the repository where fabric load the artifactories, for us is a local maven. we need to execute the command mvn clean install 
inside the next projects.

        artifacts
        services/mq-service/
        inbound
        xlate
        outbound

when the resource gets inside our repository, we will ready to make the deploy.     

<h2>4.  Deploying your profile.</h2>

When you have your profile inside your fabric and all the projects inside your local repository, it's time to make the link between the container and profile this task
will validate, will download, and will build the bundles inside the container the commands to do this are:

4.1 Connect to fabric

    <FUSE_HOME>/bin/client

4.2 Associate Profile to Container

        container-add-profile root  assigmentLab

4.3 Verifying your association

For making the verification you need to execute the next commands

        container-list 

This command shows you the result as:

         AviancaDev  1.0        Karaf   yes          default                 success           
                                                       assigmentLab                   


In this way, we can see the root container AviancaDev with the assigmentLab profile deploy inside the container.

<h2>5. Runing the Postman Test </h2>

    First, you need to import the file AssignmentCamel.json inside Postman.

    Finally, you can run the request PostSendData.

<h2>6. Another Works</h2>

For this course, we generated the same routes but for Spring-boot, these routes are available in the next repository
https://github.com/ameleito/Assignment_Lab.git, you can check them and make the comments about it.
