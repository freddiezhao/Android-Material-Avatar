/*
 * Copyright (C) 2015 Francisco Gonzalez-Armijo Riádigos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.kuassivi.material_avatar.core.animation;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public abstract class AbstractBitmapAnimator implements InterfaceBitmapAnimator {
    protected Long mDuration;
    protected Long mStartDelay;
    protected Float mScaleFactor;
    protected Interpolator mInterpolator = new LinearInterpolator();

    public Long getDuration() {
        return mDuration;
    }

    public AbstractBitmapAnimator setDuration(Long duration) {
        this.mDuration = duration;
        return this;
    }

    public Long getStartDelay() {
        return mStartDelay;
    }

    public AbstractBitmapAnimator setStartDelay(Long startDelay) {
        mStartDelay = startDelay;
        return this;
    }

    public Float getScaleFactor() {
        return mScaleFactor;
    }

    public AbstractBitmapAnimator setScaleFactor(Float scaleFactor) {
        mScaleFactor = scaleFactor;
        return this;
    }

    public Interpolator getInterpolator() {
        return mInterpolator;
    }

    public AbstractBitmapAnimator setInterpolator(Interpolator interpolator) {
        mInterpolator = interpolator;
        return this;
    }
}
