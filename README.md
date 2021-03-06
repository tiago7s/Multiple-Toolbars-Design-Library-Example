# Multiple-Toolbars-Design-Library-Example
The new Google's Design Library brings great support for developers who want to implement Material Design in their apps. It brings the Coordinator Layout, AppBarLayout and CollapsingToolbarLayout which enable the existing, already great, support Toolbar to have animations depending on what the user is doing.

The existence of this sample is lead by the necessity of having different toolbar behaviors depending on which screen the user is in. Using only Activities there is no problem using different layouts for each screen.

The problem arises when there is a single Activity or only few Activities and most of the screens are fragments. The usual implementation was to have a single Toolbar in the Activity and update its title and menus from the Fragment. But with different CoordinatorLayouts and having AppBarLayout or CollapsingToolbarLayout depending on which kind of behavior for the Toolbar the developer wants is just not feasiable to have a single Toolbar in the Activity.

So to have each Fragment with its own Layout and each having its own animations without caring about other screens seems to be the best approach. Along with showing this, this sample also shows other Design Library components that are new and tries to show how to achieve behaviors that developers might be familiar by using other third party libraries like having a Floating Action Menu since only Floating Action Button is available in the new Design Library.

# License

      Copyright 2015 Tiago Salvador
      
      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at
      
      http://www.apache.org/licenses/LICENSE-2.0
      
      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
