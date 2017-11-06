(defproject lein-essthree "0.2.3-SNAPSHOT"
  :description "Leiningen plugin for easy S3 project deployment and dependency resolution"
  :url "http://github.com/dparis/lein-essthree"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :min-lein-version "2.0.0"

  :dependencies [[joda-time "2.9.9"]
                 [amazonica "0.3.113" :exclusions [com.amazonaws/aws-java-sdk
                                                   com.amazonaws/amazon-kinesis-client]]
                 [com.amazonaws/aws-java-sdk-core "1.11.202"]
                 [com.amazonaws/aws-java-sdk-s3 "1.11.202"]
                 [org.springframework.build/aws-maven "5.0.0.RELEASE"
                  :exclusions [joda-time]]
                 [commons-logging "1.2"]
                 [funcool/cuerdas "2.0.4"]
                 [me.raynes/fs "1.4.6"]
                 [pandect "0.6.1"]
                 [pathetic "0.5.1"]
                 [prismatic/schema "1.1.7"]]

  :deploy-repositories [["releases" :clojars]]

  :profiles {:dev {:source-paths ["dev"]
                   :repl-options {:init-ns workbench}
                   :dependencies []
                   :plugins      [[lein-ancient "0.6.14"]]}}

  :eval-in-leiningen true)
