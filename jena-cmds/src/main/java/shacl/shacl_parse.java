/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package shacl;

import jena.cmd.CmdGeneral;
import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.shacl.Shapes;
import org.apache.jena.shacl.lib.ShLib;
import org.apache.jena.sys.JenaSystem;

/** SHACL parsing.
 * <p> 
 * Usage: <code>shacl parse FILE</code>
 */
public class shacl_parse extends CmdGeneral {

    static {
        LogCtl.setCmdLogging();
        JenaSystem.init();
    }
    private String shapesfile = null;

    public static void main (String... argv) {
        new shacl_parse(argv).mainRun() ;
    }

    public shacl_parse(String[] argv) {
        super(argv) ;
    }

    @Override
    protected String getSummary() {
        return getCommandName()+" FILE";
    }

    @Override
    protected void processModulesAndArgs() {
         super.processModulesAndArgs();
         if ( super.positionals.size() == 0 ) {
             System.err.println(getSummary());
             System.exit(0);
         }
    }

    @Override
    protected String getCommandName() {
        return "shacl_parse";
    }

    @Override
    protected void exec() {
        positionals.forEach(fn->{
            exec(fn);
        });
    }

    private void exec(String fn) {
        Shapes shapes = Shapes.parse(fn);
        ShLib.printShapes(shapes);
        int numShapes = shapes.numShapes();
        int numRootShapes = shapes.numRootShapes();
        System.out.printf("Shapes = %,d : Root shapes = %,d\n", numShapes, numRootShapes);
    }
}
