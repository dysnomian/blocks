(ns blocks.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [blocks.core-test]))

(enable-console-print!)

(doo-tests 'blocks.core-test)
