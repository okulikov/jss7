/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 * Start time:17:25:24 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package org.mobicents.protocols.ss7.isup.impl.message.parameter;

import org.mobicents.protocols.ss7.isup.ParameterException;
import org.mobicents.protocols.ss7.isup.message.parameter.ServiceActivation;

/**
 * Start time:17:25:24 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class ServiceActivationImpl extends AbstractISUPParameter implements ServiceActivation {

    // FIXME: this is again simple container
    /**
     * See Q.763 3.49
     */
    public static final byte _FEATURE_CODE_CALL_TRANSFER = 1;

    private byte[] featureCodes;

    public ServiceActivationImpl() {
        super();

    }

    public ServiceActivationImpl(byte[] featureCodes) {
        super();
        this.featureCodes = featureCodes;
    }

    public int decode(byte[] b) throws ParameterException {
        this.featureCodes = b;
        return b.length;
    }

    public byte[] encode() throws ParameterException {
        return this.featureCodes;
    }

    public byte[] getFeatureCodes() {
        return featureCodes;
    }

    public void setFeatureCodes(byte[] featureCodes) {
        this.featureCodes = featureCodes;
    }

    public int getCode() {

        return _PARAMETER_CODE;
    }
}
