package com.beauty_design_mode.lecture16.demo1.suppoet;

/**
 * @author Alan Yin
 * @date 2021/8/6
 */

public class AlterRule {

    public MatchRule getMatchRule(String api) {
        return null;
    }

    public MatchRule getMatchedRule(String api) {
        return new MatchRule();
    }

    public class MatchRule {

        public long getMaxTps() {
            return 100L;
        }

        public long getMaxErrorCount() {
            return 10L;
        }

        public long getMaxTimeoutTps() {
            return 60000L;
        }
    }

}
