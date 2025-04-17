package com.xworkz.Interface.external.Mainrunner;

import com.xworkz.Interface.internal.DataPipeline;
import com.xworkz.Interface.internal.Pipeline;

public class PipelineMain {
        public static void main(String[] args) {
            Pipeline pipeline1 = new DataPipeline();
            Pipeline pipeline2 = new DataPipeline();
            Pipeline pipeline3 = new DataPipeline();

            pipeline1.start();
            pipeline2.process();
            pipeline3.stop();

            pipeline.pipelineTip();
        }
    }

